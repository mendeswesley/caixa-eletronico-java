# Caixa Eletrônico em Java

Programa em **desenvolvimento** em **Java SE** que simula operações de caixa eletrônico via terminal.  
O sistema lê o saldo inicial e permite que o usuário realize saques com validações.

---

## 📌 Status do Projeto
🚧 Este projeto ainda está em desenvolvimento. Novas funcionalidades e melhorias serão adicionadas em breve.

---

## 📌 Estrutura do Projeto

```
caixa-eletronico-java/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── caixaeletronico/
│                       ├── CaixaEletronico.java
│                       ├── SaldoAtual.java
│                       └── Saque.java
```

---

## ⚙️ Funcionalidades Implementadas
- Entrada de saldo inicial com validação.
- Saque de valores com regras de negócio:
  - Não permite valores negativos ou zero.
  - Bloqueia valores inválidos (1 ou 3).
  - Impede saque maior que o saldo.

---

## 🚀 Como Compilar e Executar (Maven)

1. Clone o repositório:
   ```bash
   git clone https://github.com/mendeswesley/caixa-eletronico-java.git
   cd caixa-eletronico-java
   ```

2. Compile o projeto:
   ```bash
   mvn clean package
   ```

3. Execute o programa:
   ```bash
   mvn exec:java -Dexec.mainClass="com.mycompany.caixaeletronico.CaixaEletronico"
   ```

---

## 📄 Licença
Este projeto está sob a licença [MIT](./LICENSE.md).

---

## 👨‍💻 Autor
Desenvolvido por [Wesley Mendes](https://github.com/mendeswesley).
