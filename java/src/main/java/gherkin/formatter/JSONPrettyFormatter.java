package gherkin.formatter;


import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.GsonBuilder;

@Deprecated
public class JSONPrettyFormatter extends JSONFormatter {
    public JSONPrettyFormatter(Appendable out) {
        super(out);
    }
}
