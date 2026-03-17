## MCP Server:

In this application we have created a spring boot application and that hosts as MCP server.
This is an demo application to understand how MCP actually works, what are the techincal details and how it is working.

### Setup:

First, we updated the pom.xml file, adding the dependencies for mcp server and spring web. We are using http request in 
order to connect our client with our MCP server. And finally some auto-configured properties in application.properties.

### Introduction:

We can use generative AI to do get various results. However, we cannot use generative ai/LLMs to do things.
This is where MCP comes into place. MCP allows the connection between LLMs and external resource.
This application acts as an MCP server where all the Tools and Resources are available, to which AI model can communicate to 
get the appropriate result as per the application requirement. 

### What we are doing here?

1. Here we have created a component class in spring boot called ServerTool in which tools are defined. These tool can interact with external services as well such as db and message broker.
2. We have also used these tools class and created a bean called MethodCallBackProvider that takes collection of Tools class.
3. MethodCallBackProvider creates the instances of ToolCallBack which registers the Tool that AI model can use.
4. For the configuration this is enough.
5. Now running the application will work.

### Test the MCP Server with Claude:

1. We can test our MCP server using Claude as a client.
2. We can use ngrok to temporarily deploy our application.
3. We can register our application host url as a connector and then claude can communicate with it.

