grammar Directives;

// Lexer rules
BYTE_SIZE: [0-9]+ (('KB' | 'MB' | 'GB')?);
TIME_DURATION: [0-9]+ (('ms' | 's' | 'm' | 'h')?);

// Parser rules
value: BYTE_SIZE | TIME_DURATION;

// Other existing rules...
