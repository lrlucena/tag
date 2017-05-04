grammar Tag;

pagina: elemento*;

elemento: 'paragrafo' Bloco                   # paragrafo
        | 'imagem' Texto                     # imagem
        | 'titulo' Texto                     # titulo
        | '[quebra]'                         # quebra
        | 'link' Texto '->' Texto            # link
        | 'repete' INT elemento              # repete
        ;


Bloco:  '{' .*? '}' ;
ID : [a-z]+ ;             // match lower-case identifiers
INT: [0-9]+ ;
Texto: '"' .*? '"';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

