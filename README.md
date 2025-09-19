📒 Sistema de Agenda de Contatos em Java

Este projeto implementa um sistema de agenda em Java, utilizando os conceitos de Programação Orientada a Objetos (POO), como herança, encapsulamento e polimorfismo.

O sistema permite cadastrar pessoas, armazenar seus contatos (telefones e e-mails) e realizar buscas dentro da agenda.

🚀 Funcionalidades

Cadastrar uma pessoa com:

Nome

Data de nascimento

Lista de telefones

Lista de e-mails

Métodos principais da classe Pessoa:

getContato(String tipo): retorna um contato específico (telefone ou e-mail) pelo tipo.

idadePessoa(): calcula a idade da pessoa com base na data de nascimento.

pessoaValida(): verifica se a pessoa possui pelo menos um contato válido.

equals(Pessoa outra): compara duas pessoas (nome e data de nascimento).

toString(): exibe as informações da pessoa e seus contatos.

Métodos principais da classe Agenda:

adicionaPessoa(Pessoa p): adiciona uma pessoa à agenda.

removePessoa(Pessoa p): remove uma pessoa da agenda.

buscaPessoa(String nome): retorna todas as pessoas com determinado nome.

buscaPessoa(String nome, int idade): retorna todas as pessoas que atendem ao nome e idade especificados.

toString(): exibe todas as pessoas cadastradas na agenda.

📂 Estrutura das Classes

Contato (abstrata)

String tipo

Métodos: getTipo(), toString()

Telefone (extends Contato)

String telefone

Email (extends Contato)

String email

Pessoa

String nome

String dataNascimento

ArrayList<Contato> contatos

Agenda

ArrayList<Pessoa> pessoas

🛠️ Tecnologias Utilizadas

Java 17+

POO (Programação Orientada a Objetos)
