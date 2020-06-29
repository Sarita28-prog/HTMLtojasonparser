# HTMLtojsonparser
Converts a particular HTML file to JSON object(JSON file) when dynamically loaded.


I have used SpringBoot framework for parsing in json Object.
When the html file loads on browser the attributes parses to JSONObject class and converts it into output.json file

To load the project on any system, you need the SpringBoot framework libraries which could be run through CLI or on IDE(Netbeans).
When View.html file loads on browser it generates output.json file

Additionally it could run on generic Tomcat server as well.



Basically the SpringBoot framework maps the request associated with the View.html to DemoJsonParser.java such that when the request arrives for the demojsonparser.java it downloads a output.json as in response.



