#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.abbyyeu.fre11test.Document;
import com.abbyyeu.fre11test.requests.Request;

public class ${NAME} extends Request {
    @Override public void process(Document document) throws IOException {
        document.addFolder().process().export(FileExportFormatEnum.FEF_RTF);
    }
}
