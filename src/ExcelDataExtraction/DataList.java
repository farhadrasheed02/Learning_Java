package ExcelDataExtraction;


	import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlRootElement;
	import java.util.List;

	@XmlRootElement(name = "dataList")
	public class DataList {
	    private List<String> values;

	    @XmlElement(name = "value")
	    public List<String> getValues() {
	        return values;
	    }

	    public void setValues(List<String> values) {
	        this.values = values;
	    }
	}


