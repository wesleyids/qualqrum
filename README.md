# qualqrum

## Overview

>Gerador de dados fictícios aleatórios para aplicações em Java.

## Demo

#### Pessoa Física

Gera pessoa simples

```java
PessoaFisica pf = new Generator.GeneratorBuilder()
                    .create()
                    .pessoaFisica();
```

Gera pessoa cdo sexo masculino

```java
PessoaFisica pf = new Generator.GeneratorBuilder()
                    .sexoMasculino()
                    .create()
                    .pessoaFisica();
```

Gera pessoa cdo sexo feminino

```java
PessoaFisica pf = new Generator.GeneratorBuilder()
                    .sexoFeminino()
                    .create()
                    .pessoaFisica();
```
Sexo feminino e maior de idade

```java
PessoaFisica pf = new Generator.GeneratorBuilder()
                    .sexoFeminino()
                    .setMaiorIdade(true)
                    .create()
                    .pessoaFisica();
```

Gera pessoa por uf


```java
PessoaFisica pf = new Generator.GeneratorBuilder()
                    .sexoFeminino()
                    .setEstado("SP")
                    .create()
                    .pessoaFisica();
```

Mapper

```java
PessoaFisicaMeuDTO pf = new Generator.GeneratorBuilder()
                    .sexoMasculino()
                    .setEstado("SP")
                    .create()
                    .toResult(PessoaFisicaMeuDTO.class, TipoPessoa.FISICA);
```

#### Pessoa Jurídica

Gera pessoa simples

```java
PessoaJuridica pj = new Generator.GeneratorBuilder()
                .setEstado("sp")
                .create()
                .pessoaJuridica();
``` 

#### Tipos de geradores

Gera um CPF aleatório

```java
Generator.cpf();
```

Gera um CNPJ aleatório

```java
Generator.cnpj();
```

Gera um email aleatório a partir de um nome

```java
Generator.email("Homer Simpson");
```

Gera um email aleatório

```java
Generator.email();
```

Gera uma senha aleatória
```java
Generator.senha();
```

Gera uma senha aleatória com um tamanho pré definido
- `Tamanho mínimo: 8`
- `Tamanho máximo: 70`

```java
Generator.senha(50);
```

Gera uma uf aleatório
```java
Generator.estado();
```

Gera um estado aleatório

```java
Generator.uf();
```

Gera uma cidade aleatória

```java
Generator.cidade();
```

Validador de CNPJ
- `Com/Sem máscara`

```java
Validator.cnpjValid("34.188.377/0001-38");
```

Validador de CPF
- `Com/Sem máscara`

```java
Validator.cpfValid("123.456.789-12");
```

Validador de email

```java
Validator.emailValid("homer.simpson@gmail.com");

#### TO-DO
- Inscrição Estadual
- Gerar PIS
- Gerar CNAE
- Gerar CNH
- Gerar dados de Veículo
- Pessoa Júridica incompleto
- Preencher ceps por estado