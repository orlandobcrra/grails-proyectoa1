package org.pa1

//import org.codehaus.groovy.grails.plugins.jasper.JasperExportFormat
//import org.codehaus.groovy.grails.plugins.jasper.JasperReportDef

class HolaController {

    def index() {
        render(view: 'vista1') 
    }
    
    def informe() {
	def listaDatos = Autor.findAll();
        params._format="PDF";
        params._name="Reporte1";
        params._file="Reporte1";
	chain(controller: "jasper", action: "index", model: [data: listaDatos], params: params)
    }
    
    def jasperService
    def informe2() {
        //def reportDef = new JasperReportDef(name:'Reporte1.jasper',
        //    fileFormat:JasperExportFormat.HTML_FORMAT
        //)
        // render 
        //FileUtils.writeByteArrayToFile(new File("test.pdf"), jasperService.generateReport(reportDef).toByteArray())
        
        
        //        JasperReportDef has the following properties:
        //
        //name - Name of the Report. (Required)
        //fileFormat - Fileformat of the Report. Please use the JasperExportFormat Enum. (Required)
        //folder - The folder where you placed your reports. Defaults to /reports if unset and no global setting (jasper.report.dir in Config.groovy) exists.
        //reportData - Collection containing the data of your report (leave empty if you want to use a SQL query inside your report)
        //locale - Locale to use in the report generation.
        //parameters - All additional parameters as a Map.
    }
}
