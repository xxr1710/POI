package com.offcn.poi;

import com.offcn.pojo.Hospital;
import org.apache.poi.hssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class POIWrite {

    public static void main(String[] args) throws IOException {

        List<Hospital> list = new ArrayList<>();
        for(int i=0;i<1000;i++){
            Hospital h = new Hospital();
            h.setId(i+1);
            h.setTitle("医疗"+i);
            h.setCity("上海"+i);
            h.setProvince("中国"+i);
            h.setHospitalOn("骨科"+i);
            h.setBuildDate(new java.util.Date());
            h.setMoney(3.456+i);
            h.setPercent(0.01);
            list.add(h);
        }
        //创建新excel文档，07版本之前均可以这么写
        HSSFWorkbook workBook = new HSSFWorkbook();
        //新建工作表
        HSSFSheet sheet = workBook.createSheet("第一页");
        //设置单元格的高度
        sheet.setColumnWidth(0, 2500);
        //新建行
        HSSFRow row = sheet.createRow(0);

        //第一行中有几个字段
        HSSFCell cell[] = new HSSFCell[8];
        for(int i = 0; i < cell.length; i++){
            //取第一行第一列
            cell[i] = row.createCell(i);
        }
        //给第一行所有列赋值
        cell[0].setCellValue("id");
        cell[1].setCellValue("hospitalOn");
        cell[2].setCellValue("province");
        cell[3].setCellValue("city");
        cell[4].setCellValue("title");
        cell[5].setCellValue("buildDate");
        cell[6].setCellValue("money");
        cell[7].setCellValue("百分比");
        for(int i = 0; i < list.size(); i++){
            Hospital hospital = list.get(i);
            HSSFRow dataRow = sheet.createRow(i+1);
            //创建盛放所有列的数组
            HSSFCell dataCell[] = new HSSFCell[8];
            for(int j = 0; j < dataCell.length; j++){
                //取得第一行所有列
                dataCell[j] = dataRow.createCell(j);
            }
            dataCell[0].setCellValue(hospital.getId());
            dataCell[1].setCellValue(hospital.getHospitalOn());
            dataCell[2].setCellValue(hospital.getProvince());
            dataCell[3].setCellValue(hospital.getCity());
            dataCell[4].setCellValue(hospital.getTitle());
            dataCell[5].setCellValue(hospital.getBuildDate());
            dataCell[6].setCellValue(hospital.getMoney());
            dataCell[7].setCellValue(hospital.getPercent());
            //创建样式
            HSSFCellStyle cellStyle = workBook.createCellStyle();
            //日期
            HSSFDataFormat format= workBook.createDataFormat();
            cellStyle.setDataFormat(format.getFormat("yyyy年MM月dd日"));
            dataCell[5].setCellStyle(cellStyle);

            //小数
            HSSFCellStyle cellStyle1 = workBook.createCellStyle();
            HSSFDataFormat format1= workBook.createDataFormat();
            cellStyle1.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00"));
            //货币格式
            //cellStyle1.setDataFormat(format1.getFormat("¥#,##0"));
            dataCell[6].setCellStyle(cellStyle1);

            //百分比
            HSSFCellStyle cellStyle2 = workBook.createCellStyle();
            HSSFDataFormat format2= workBook.createDataFormat();
            cellStyle2.setDataFormat(format2.getFormat("0%"));
            dataCell[7].setCellStyle(cellStyle2);
        }

        File file = new File("F:\\hospital.xls");
        FileOutputStream fos = new FileOutputStream(file);
        workBook.write(fos);
        fos.close();


    }

}
