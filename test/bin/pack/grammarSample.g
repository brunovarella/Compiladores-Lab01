grammar grammarSample;

options {
  language = Java;
}

@header {
  package pack;
}
@lexer::header {
  package pack;
}
rule: IDENT+ ;

IDENT: 'a'..'z'|'A'..'Z' +;

Whitespace :
  (' ' | '\t' | '\f')+ {$channel=HIDDEN;};