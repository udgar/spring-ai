# spring-ai

## Working with LLMS:

### How it works:
1. First give input.
2. Tokenization.
3. Pattern Matching.
4. Neural Network Pattern Recognition
5. Prediction(from many text examples)

### Training Process:
1. Pretraining (Using a lot of datas, books, text)
2. Fine-Tuning(Specialization, Task-specific database)

LLMS learn form examples

### Generative AI:

1. How they process language?
2. Pre-training on vast amounts of data.
3. Generative capabilities.

#### PROMT Engineering is the Key
Structure determines the success
Clear communication is the key(write clear prompt)

#### Prompting:

1. Zero-shot prompting: Asking AI do to the task without providing any examples
2. On-shot prompting: Giving an example for the AI in order to follow a specific pattern while generating the result
3. Few-shot example: Providing few examples to determine the result you are expecting
4. Chain-of-thought prompting: Guiding an AI through your chain of thought, step by step guide
5. XML Tags: Help structure complex requests by managing them in XML tags.
6. Task Decomposition: Structure the requirement in seperate phases and execute one phase at a time.

#### Notes:
1. Be specific
2. Use examples
3. Context about your environment
4. Specify a role(Give AI an persona)
5. Iterate and refine(Don't expect result on first try)
6. Use AI to Improve your prompt
7. Save Good Prompt

**Good Practice:** Prompting with voice

## JAVA and AI:

### Why JAVA for AI:
1. Leverage AI in JAVA Application.
2. Integrating AI with enterprise level application.
3. Spring AI necessary APIs.
4. Use cases(docs summarization).
5. Spring AI provides more facilities than just calling Rest API calls to LLMS models.

### Spring AI:

AI for spring developers

1. Portable API support accross AI providers for Chat, Image and Audio.
2. Synchronous and Streaming API options
3. Inspired by LAMAIndex and Langchain

### Getting started: 

1. Signing up for an API key.
2. Use gemini for now please because it is free for now.

## Agentic AI:

### How LLM works:
1. Prompt given by AI
2. LLM is envoked
3. Response is provided

### Do something with the Response:

1. Invoke Tools
2. RAG wraps the LLM (bring the data of enterprise into LLM)
3. Tool Resource (can be anything)

Whole concept of MCP is to make all the things that we need readily availble in a server

### Architecture:

Building an agent
1. Host Application, where application is run
2. Host application uses MCP client library to create instance of client
3. We create an Server
4. In Server we have access to tools, resources, prompts
5. Capabilities(what resources are available)
6. Host and Server are connected with each other(HTTP/SEE) content in JSON/RCP
7. Client Communicates with the prompt

Example:
1. Arrange an event that we need in order to arrange in meet
2. User provides the prompt that feeds into the server
3. Now server can communicate with LLM 
4. MCP server tells the LLM the prompt and list of resources available to us.

### How LLM works:
1. Gets request and provides response
2. LLM cannot take actions, cannot interact with external tools that do things for us.
3. We need something else that can do that

### AI agents:
They can interact with Third Party tools and LLMs and go back and forth in order to work on their own.
They perform a series of different tasks using LLMs.

Example: n8n
We can build agent from scratch.

### How can Agent actually communicate with the third party application:

They use Tools.
1. Tool allows agent to interact with another platform.
2. Tool interact with other platform through the use of api

### Model Context Protocol:

1. Provide agents the context they need to perform tasks.
2. Introduced by Anthropic
3. We need MCP configuration file
4. MCP configuration allows the agent to use MCP to connect to db(upon configuration)
5. What if we scale up the application? What if multiple agents are required in order to communicate with each other?

### Agent to Agent Protocol(A2A Protocol):

1. Allows the Agent to collaborate with each other.
2. Allows one agent to discover capabilities in another agent.
3. Back and forth communication between agents.

### Real life use case:
1. Identify ehat changes where made in the code and revert it (interacts with the git in order to track changes)
2. We seem to be missing details from stripe record(access SQL Queries, Access Stripe and other associated with the application)

