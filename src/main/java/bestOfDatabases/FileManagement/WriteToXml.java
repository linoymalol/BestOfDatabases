package bestOfDatabases.FileManagement;

import com.fasterxml.jackson.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class WriteToXml {
    public void write(String path, String text) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File(path), text);
    }

}
