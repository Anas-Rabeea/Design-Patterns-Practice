package org.template.report;

public abstract class ReportGenerator {

    protected abstract void loadData();
    protected abstract void generateContent();
    protected abstract void export();

    // Template Method : final to not change the flow
    public final  void generateReport() {
          loadData ();
          generateContent ();
          export ();
    }

}
