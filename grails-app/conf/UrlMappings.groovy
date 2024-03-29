class UrlMappings {

    static mappings = {
		
        /* 
         * Pages without controller 
         */
        //		"/"				(view:"/index")
		"/about"		(view:"/siteinfo/about")
		"/blog"			(view:"/siteinfo/blog")
		"/systeminfo"	(view:"/siteinfo/systeminfo")
		"/contact"		(view:"/siteinfo/contact")
		"/terms"		(view:"/siteinfo/terms")
		"/imprint"		(view:"/siteinfo/imprint")
		
        /* 
         * Pages with controller
         * WARN: No controller should be named "api" or "mobile" or "web"!
         */
        
        "/admin/cfDashboard/$action?"(controller: 'cloudFoundryDashboard')
        "/admin/cfDashboard/application/$appName"(controller: 'cloudFoundryDashboard', action: 'application')
        "/admin/cfDashboard/service/$serviceName"(controller: 'cloudFoundryDashboard', action: 'service')
        "/admin/cfDashboard/files/$appName/$instanceIndex?"(controller: 'cloudFoundryDashboard', action: 'files')
        
        
        "/"	{
            controller	= 'home'
            action		= { 'index' }
            view		= { 'index' }
        }
		"/$controller/$action?/$id?"{
            constraints {
                controller(matches:/^((?!(api|mobile|web)).*)$/)
            }
        }
		
        /* 
         * System Pages without controller 
         */
		"500"	(view:'/error')
    }
}
