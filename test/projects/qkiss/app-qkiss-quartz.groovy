
grails.plugin.quartz2.autoStartup = true

grails.plugin.quartz2.configTriggerJob = { 
	simple repeatInterval: 1500l, repeatCount:-1
}

org{
	quartz{
		scheduler.instanceName = 'TestAppScheduler'
		threadPool.class = 'org.quartz.simpl.SimpleThreadPool'
		threadPool.threadCount = 5
		threadPool.threadPriority = 5
		threadPool.threadsInheritContextClassLoaderOfInitializingThread = true
		jobStore.class = 'org.quartz.simpl.RAMJobStore'
		jobStore.misfireThreshold =60000
	}
}


