
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.joda.time.DateTime;
import org.junit.Test;
import java.io.FileInputStream;


public class ReadTest {


    @Test
    public void testRead() throws Exception {

        //1.创建流
        FileInputStream inputStream = new FileInputStream("src/数据说明.xls");

        //2.创建一个工作簿
        Workbook workbook = new HSSFWorkbook(inputStream);

        //3.获取表
        Sheet sheet = workbook.getSheetAt(0);

        //4.获取表中的内容
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int rowNum = 0; rowNum < rowCount; rowNum++) {
            Row rowData= sheet.getRow(rowNum);
            if(rowData!=null){
                //读取列
                int cellCount = rowData.getPhysicalNumberOfCells();
                for (int cellNum = 0; cellNum < cellCount; cellNum++) {
                    Cell cell = rowData.getCell(cellNum);
                    //匹配数据类型
                    if(cell!=null){
                        CellType cellType = cell.getCellType();

                        String cellValue="";

                        switch(cellType){
                            case STRING:
                                cellValue= cell.getStringCellValue();
                                break;
                            case BOOLEAN:
                                cellValue = String.valueOf(cell.getBooleanCellValue());
                                break;
                            case BLANK:
                            case ERROR:
                                break;
                            case NUMERIC:
                                if(DateUtil.isCellDateFormatted(cell)){
                                    cellValue = new DateTime(cell.getDateCellValue()).toString("yyyy-mm-dd");
                                } else {
                                    cellValue = String.valueOf(cell.getNumericCellValue());
                                }
                                break;
                        }
                        System.out.print(cellValue + " | ");
                    }
                }
            }
            System.out.println();
        }
        inputStream.close();
    }


}
