package org.ejb.session.ejb.utility;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {

        void generateReportFile(String content) throws IOException {

            FileWriter fileWriter = new FileWriter("~/DailyReports/Report.csv");
            fileWriter.write(content);
            fileWriter.close();
        }

}



