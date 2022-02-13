package com.example.poi.mapper;

import com.example.poi.domain.Elements;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ElementsMapperTest {

    @Autowired
    private ElementsMapper elementsMapper;
    Elements elements = new Elements();

    @Test
    void findAllElements(){
        elementsMapper.findAllElements().forEach(System.out::println);
    }

    @Test
    void testRead() throws Exception {

        //1.创建流
        FileInputStream inputStream = new FileInputStream("src/数据说明.xls");

        //2.创建一个工作簿
        Workbook workbook = new HSSFWorkbook(inputStream);

        int sheetCount = workbook.getNumberOfSheets();
        //3.获取表
        for (int sheetNum = 1; sheetNum < sheetCount; sheetNum++) {
            Sheet sheet = workbook.getSheetAt(sheetNum);
            //4.获取表中的内容
            int rowCount = sheet.getPhysicalNumberOfRows();
            for (int rowNum = 2; rowNum < rowCount; rowNum++) {
                Row rowData = sheet.getRow(rowNum);
                if (rowData != null) {
                    //读取列
                    int cellCount = rowData.getPhysicalNumberOfCells();
                    for (int cellNum = 0; cellNum <= cellCount+1; cellNum++) {
                        Cell cell = rowData.getCell(cellNum);
                        //匹配数据类型
                        if (cell != null) {

                            switch (cellNum) {
                                case 0:
                                    elements.setId((int) cell.getNumericCellValue());
                                    break;
                                case 1:
                                    elements.setS1(cell.getNumericCellValue());
                                    break;
                                case 2:
                                    elements.setS2(cell.getNumericCellValue());
                                    break;
                                case 3:
                                    elements.setS3(cell.getNumericCellValue());
                                    break;
                                case 4:
                                    elements.setS4(cell.getNumericCellValue());
                                    break;
                                case 5:
                                    elements.setS5(cell.getNumericCellValue());
                                    break;
                                case 6:
                                    elements.setS6(cell.getNumericCellValue());
                                    break;
                                case 7:
                                    elements.setS7(cell.getNumericCellValue());
                                    break;
                                case 8:
                                    elements.setS8(cell.getNumericCellValue());
                                    break;
                                case 9:
                                    elements.setS9(cell.getNumericCellValue());
                                    break;
                                case 10:
                                    elements.setS10(cell.getNumericCellValue());
                                    break;

                                case 11:
                                    elements.setS11(cell.getNumericCellValue());
                                    break;

                                case 12:
                                    elements.setS12(cell.getNumericCellValue());
                                    break;

                                case 13:
                                    elements.setS13(cell.getNumericCellValue());
                                    break;

                                case 14:
                                    elements.setS14(cell.getNumericCellValue());
                                    break;

                                case 15:
                                    elements.setS15(cell.getNumericCellValue());
                                    break;

                                case 16:
                                    elements.setS16(cell.getNumericCellValue());
                                    break;

                                case 17:
                                    elements.setS17(cell.getNumericCellValue());
                                    break;

                                case 18:
                                    elements.setS18(cell.getNumericCellValue());
                                    break;

                                case 19:
                                    elements.setS19(cell.getNumericCellValue());
                                    break;

                                case 20:
                                    elements.setS20(cell.getNumericCellValue());
                                    break;

                                case 21:
                                    elements.setS21(cell.getNumericCellValue());
                                    break;

                                case 22:
                                    elements.setS22(cell.getNumericCellValue());
                                    break;
                            }
                        }else if((cell==null) && (cellNum==cellCount+1)){
                            elements.setLogTime(LocalDateTime.now());
                        }

                    }
                    elementsMapper.save(elements);
                }

            }
            inputStream.close();
        }
    }
}