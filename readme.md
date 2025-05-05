[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/KKrNRA9P)


# Batalha Naval - Visualização com a classe Draw

## Estrutura do Projeto

- **`App.java`**: Classe principal que cria a tela, instancia as grades e posiciona os navios.
- **`Grade.java`**: Representa o tabuleiro do jogo.
- **`Navio.java`**: Responsável por posicionar e desenhar os navios na grade.

---

## `App.java`

- Cria uma janela de **1000 x 600** pixels, onde são desenhadas as grades e posicionados os navios.
- Instancia duas grades (uma para o jogador e uma para o alvo) usando a classe `Grade`.
- Cria um vetor com todos os navios do jogador.
- Os navios podem ser criados de duas formas:
  - Com número inteiro representando a linha:  
    `new Navio(gradeJogador, 4, 0, 0, false);`
  - Com caractere representando a linha (de 'A' a 'J'):  
    `new Navio(gradeJogador, 4, 0, 'A', false);`

---

## `Grade.java`

- Define 5 constantes internas: coordenadas `x` e `y`, tamanho da célula, número de linhas e colunas.
- Ao instanciar uma `Grade`, define-se a posição inicial (x, y).
- A função `desenhar`:
  - Utiliza dois laços `for` para desenhar as células como quadrados.
  - Adiciona legendas:
    - **Letras** (A–J) na vertical, com ajuste para espaçamento usando `x - 15`.
    - **Números** (0–9) na horizontal, com ajuste usando `y - 15`.
- Contém **getters** (`getX()`, `getY()`, `getCelula()`) utilizados pela classe `Navio` para posicionamento preciso.

---

## `Navio.java`

- Contém atributos para tamanho, posição (linha, coluna), orientação e referência à `Grade`.
- O construtor verifica:
  - Se a posição está dentro dos limites da grade.
  - Se o navio ultrapassa a borda (horizontal ou vertical).
- Implementa **sobrecarga de construtores**, permitindo usar letra ou número para a linha.
- O método auxiliar `letraLinha(char)` converte letras de 'A' a 'J' em índices (0–9).
- O método `desenhar`:
  - Usa um `for` para desenhar quadrados preenchidos ao longo do navio.
  - A direção é controlada pela flag `vertical`.
  - Os quadrados são um pouco menores que as células para manter a visualização da grade.