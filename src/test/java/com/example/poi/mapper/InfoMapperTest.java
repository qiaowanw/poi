package com.example.poi.mapper;

import com.example.poi.domain.Info;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InfoMapperTest {

    @Autowired
    private InfoMapper infoMapper;
    Info info = new Info();

    @Test
    void save() {
        info.setCode("S1");
        info.setElements("PH");
        info.setSdLowerLimit(0.0);
        info.setSdUpperLimit(14.0);
        info.setUnit("mg/L");
        info.setVdLowerLimit(6.0);
        info.setVdUpperLimit(9.0);
        infoMapper.save(info);
    }

    @Test
    void testRead() throws Exception {

        //1.创建流
        FileInputStream inputStream = new FileInputStream("src/数据说明.xls");

        //2.创建一个工作簿
        Workbook workbook = new HSSFWorkbook(inputStream);

        //3.获取表
        Sheet sheet = workbook.getSheetAt(0);

        //4.获取表中的内容
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int rowNum = 1; rowNum < rowCount; rowNum++) {
            Row rowData= sheet.getRow(rowNum);
            if(rowData!=null){
                //读取列
                int cellCount = rowData.getPhysicalNumberOfCells();
                for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                    Cell cell = rowData.getCell(cellNum);
                    //匹配数据类型
                    if(cell!=null){
                        switch(cellNum){
                            case 0:
                                info.setCode(cell.getStringCellValue());
                                break;
                            case 1:
                                info.setElements(cell.getStringCellValue());
                                break;
                            case 2:
                                info.setSdLowerLimit(cell.getNumericCellValue());
                                break;
                            case 3:
                                info.setSdUpperLimit(cell.getNumericCellValue());
                                break;
                            case 4:
                                info.setUnit(cell.getStringCellValue());
                                break;
                            case 5:
                                info.setVdLowerLimit(cell.getNumericCellValue());
                                break;
                            case 6:
                                info.setVdUpperLimit(cell.getNumericCellValue());
                                break;
                        }
                    }
                }
                infoMapper.save(info);
            }
        }
        inputStream.close();
    }
}