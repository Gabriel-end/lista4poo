QUESTAO 1: 

a) Verdadeira.
b)Falso. Na herança é implementado o relacionamente É UM (is-a). Por exemplo, Funcionario é uma pessoa. 
c) Falso. É uma sobrescrita, que acontece quando tem metodos com o mesmo nome, mas com parametros diferentes.

QUESTAO 2: 

O modificador private oferece maior encapsulamento, pois restringe o acesso aos membros da própria classe, protegendo os dados contra alterações indevidas. Já o protected permite o acesso também pelas subclasses e classes do mesmo pacote, facilitando a reutilização por herança. Embora o protected torne o desenvolvimento mais flexível, seu uso excessivo pode aumentar o acoplamento entre as classes. Por isso, recomenda-se priorizar o private e utilizar o protected quando necessário.

QUESTAO 3:

Quando um objeto de uma subclasse é criado, o construtor da superclasse também precisa ser executado para inicializar a parte herdada do objeto. Isso pode ocorrer implicitamente, quando o Java insere automaticamente super(), ou explicitamente, usando super(...) para chamar um construtor específico, sendo essa chamada a primeira instrução do construtor da subclasse. Caso não exista um construtor compatível na superclasse, o código não compilará.