# AI Fundamentals:

## Agents:
Agents are configuration file with extension **.agent.md** that describes what they do and which MCP server they invoke.

### When to use agent?:
When you need co-pilot to run command automatically, you have repeated workflows or you need consistent behavior.

## Skills:
Skills consist resuable capabilities for Copilot, and is in **SKILL.md** file, they also consist of resources like docs, templates and scripts.

### Skills Contain:
1. Name for discovery
2. Description to tell agent what to do.
3. Instruction on how skills should be executed.
4. References to any resources.

### Skills better that prompt:
1. Agent can easily discover them.
2. They have detailed instruction.
3. Can be used in multiple coding platform.

## Instruction:
**.instructions.md** file that provides background context for co-pilot.

1. Coding conventions.
2. Frameworks specification.
3. Repository specific rules.

## Agent,Skills and Instruction:
1. Instruction provide groundwork and context on how the work should be done.
2. Skills let you trigger the workflow.
3. Agents bring everything together.