# Relatório de Execução - ClinicaPetVida

# Informações do Aluno
* **Matrícula (NN):** 16
* **ID Personalizado (100 + NN):** 116
* **Nome do Pet (Pet_NN):** Pet_16

---

# Parte B — Planejamento da camada de controle

| Ação | Tipo de requisição | URL completa | Mapeamento (anotação) | Template |
| :--- | :--- | :--- | :--- | :--- |
| **Mostrar a ficha do animal** | GET | `http://localhost:8080/ficha_16` | `@GetMapping("/ficha_16")` | `ficha` |
| **Mostrar a ficha do tutor** | GET | `http://localhost:8080/tutor_16` | `@GetMapping("/tutor_16")` | `tutor` |
| **Mostrar o resumo da clínica** | GET | `http://localhost:8080/resumo_16` | `@GetMapping("/resumo_16")` | `resumo` |
| **Cadastrar um novo animal** | POST | não existe | não existe | não existe |

# Questão B.1
O Spring decide qual método executar olhando tanto o tipo da requisição (**GET** ou **POST**) quanto o caminho da **URL**.
todas as rotas criadas servem apenas para buscar e exibir dados na tela, por isso usam o método **GET**. 
Precisando obrigatoriamente da **URL** (`/ficha_16`, `/tutor_16` ou `/resumo_16`) para diferenciar cada requisição.
---

# A.7 — Evidências de Execução

As capturas de tela das execuções do sistema foram salvas no diretório `evidencias/` e contêm a URL, o conteúdo da página, o relógio do sistema e os dados personalizados ($NN = 16$).

# 1. Rota Ficha (`/ficha_16`)
![Ficha do Animal](evidencias/ficha_16.png)

# 2. Rota Tutor (`/tutor_16`)
![Ficha do Tutor](evidencias/tutor_16.png)

# 3. Rota Resumo (`/resumo_16`)
![Resumo da Clínica](evidencias/resumo_16.png)

# 4. Console H2 (Consulta SQL)
![Console H2](evidencias/h2_console.png)


# Parte C (Depuração)

#