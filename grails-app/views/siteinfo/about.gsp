<html>

<head>
	<title><g:message code="default.about.title" args="[meta(name:'app.name')]"/></title>
	<meta name="layout" content="kickstart" />
</head>

<body>

	<section id="intro">
		<h1><g:message code="default.welcome.title" args="[meta(name:'app.name')]"/></h1>
		<p class="lead">
			${meta(name:'app.name')}
			is the hottest System since sliced bread!
		</p>
	</section>

	<section id="additional">
		<h1><g:message code="default.welcome.title" args="['Kickstart']"/></h1>
		<p>Kickstart is an extension for Grails in order to start with a
			good looking template for your project. It uses the Bootstrap web
			page template by Twitter and provides adapted scaffolding templates
			for standard web pages.</p>
	</section>
  
  <g:jasperReport
          jasper="Reporte1"
          format="PDF,HTML,XML,CSV,XLS,RTF,TEXT,ODT,ODS,DOCX,XLSX,PPTX"
          name="Reporte1">
    Your name: <input type="text" name="name"/>
  </g:jasperReport>

-----------

<g:jasperForm controller="jasper"
    action="exampleWithData"
    id="1498"
    jasper="w_iReport" >
    ..form contents.. dsfasf

    <g:jasperButton format="pdf" jasper="jasper-test" text="PDF" />

    .. other html..

    </g:jasperForm>

</body>

</html>
