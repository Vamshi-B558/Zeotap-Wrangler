# Wrangler Enhancements: Byte Size and Time Duration Units Parsers

## Background
The CDAP Wrangler library currently parses various data types but lacked built-in support for easily handling units like Kilobytes (KB), Megabytes (MB), milliseconds (ms), or seconds (s). This enhancement aims to provide native support for parsing and utilizing byte size and time duration units within recipes.

## Objectives
- Integrate new lexer tokens (BYTE_SIZE, TIME_DURATION) into the Wrangler grammar.
- Update the relevant Java code (wrangler-api, wrangler-core) to handle these new token types.
- Implement a new aggregate directive (aggregate-stats) that utilizes these new types.
- Develop comprehensive test cases, including aggregation scenarios using the new units.

## Implementation Steps
1. **Grammar Modification**: Updated the `Directives.g4` file to add lexer rules for BYTE_SIZE and TIME_DURATION, and modified parser rules to accept these tokens.
2. **API Updates**: Created new Java classes `ByteSize.java` and `TimeDuration.java` extending the `Token` class, implementing parsing logic for the respective units.
3. **Core Parser Updates**: Added visit methods for the new parser rules to handle the new tokens.
4. **New Directive Implementation**: Developed a new directive class for aggregation that utilizes the new byte size and time duration units.
5. **Testing**: Added unit tests for the new classes and directive to ensure correct parsing and functionality.

## Conclusion
These enhancements provide users with the ability to easily handle byte sizes and time durations in their data processing workflows, simplifying complex multi-step recipes.

## Future Work
- Further testing and validation of the new features.
- Documentation updates to reflect the new capabilities.
