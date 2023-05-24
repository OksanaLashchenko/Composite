import java.util.ArrayList;
import java.util.List;

public class FieldSet implements HtmlForm{

    private final List<HtmlForm> fields = new ArrayList<>();

    @Override
    public void create() {
        for (HtmlForm field : fields) {
            field.create();
        }
    }

    public List<HtmlForm> getFields() {
        return fields;
    }

    public void addField(HtmlForm field) {
        fields.add(field);
    }

    public void removeField(HtmlForm field) {
        fields.remove(field);
    }

}
