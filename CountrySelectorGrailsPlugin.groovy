import org.grails.plugins.countrySelector.SearchResourceBundleMessageSource

class CountrySelectorGrailsPlugin {
   def version = "0.1"
   def grailsVersion = "2.0 > *"

   def title = "Country Selector Plugin"
   def author = "Matouš Kučera"
   def authorEmail = "matous.kucera@tado.com"
   def description = "Provides an advanced country selector in your grails application."

   def documentation = "energybob.github.io/grails-country-selector"

   def license = "GPL3"

   def organization = [name: "tado GmbH", url: "http://tado.com/"]

   def issueManagement = [system: "Github", url: "https://github.com/EnergyBob/grails-country-selector/issues"]

   def scm = [url: "https://github.com/EnergyBob/grails-country-selector"]

   def dependsOn = [i18n: "* > 1.0"]

}
