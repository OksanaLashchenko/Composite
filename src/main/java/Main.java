import java.util.List;

public class Main {

    public static void main(String[] args) {
        HtmlForm inputField = new InputField();
        HtmlForm selectField = new SelectField();
        FieldSet fieldSet = new FieldSet();
        fieldSet.addField(inputField);
        fieldSet.addField(selectField);
        List<HtmlForm> fields = fieldSet.getFields();
        System.out.println(fields);
        fieldSet.create();

        fieldSet.removeField(selectField);
        List<HtmlForm> fields2 = fieldSet.getFields();
        System.out.println(fields2);
        fieldSet.create();
    }

}
