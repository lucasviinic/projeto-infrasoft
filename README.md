# Objetivo

O exercício de concorrência consiste num conjunto de exercícios, sem necessidade de
interface gráfica, onde os alunos deverão desenvolver utilizando concorrência na linguagem
Java. Que deverá ser feito individual ou em dupla seguindo as especificações descritas aqui.

# Contexto

Um cientista muito renomado decidiu que estava na hora de migrar 1% da população do
planeta Terra para outro planeta. Para isso, ele criou, nesse novo planeta, uma nova cidade
chamada New City. E para que as atividades comuns de uma cidade funcionem rapidamente,
vários profissionais estão trabalhando em conjunto. Arquitetos e Engenheiros de Software
também estão trabalhando na implementação de alguns sistemas dessa cidade. Logo, você
deve estudar, discutir e apresentar as soluções para os problemas listados abaixo.

## Entrega 1

### Problema 1: Sistema Bancário

O banco criou um sistema para compartilhar uma mesma conta entre os membros de
uma família. Onde é possível fazer depósitos e saques, que podem acontecer
simultaneamente. Deseja-se manter a uniformidade do saldo da conta, que por sua vez é
utilizada por mais de um membro da família. Sua tarefa é criar duas operações (saque e
depósito) que alteram uma variável chamada saldo e garantir que um cliente não consiga sacar
mais do que a conta tem de saldo.

Observações:
- Lembre-se de simular várias pessoas (threads) sacando
simultaneamente na mesma conta.
- Crie uma thread para cada pessoa que deseja fazer uma operação.

### Problema 2: Construção de uma Ponte

Uma ponte está sendo construída, mas o espaço da ponte será bem estreita, com
apenas uma única faixa. Mas, os carros (threads) trafegam nas duas direções. Portanto, é
necessário alguma forma de sincronizar para que os carros não colidam. Na prática, quando a
ponte está vazia, um carro (da esquerda ou da direita) pode entrar nela. Uma vez que o carro
entra na ponte, ele precisa atravessá-la e depois sair. Só então um próximo carro (da esquerda
ou da direita) pode usar a ponte. Sua tarefa é implementar um programa que simula essa
situação. Considere ainda duas versões desse mesmo problema, uma onde a ponte tem o
controle de fluxo (com sincronização) e outra onde a ponte não tem controle de fluxo (sem
sincronização).

Observações:
- Crie uma thread para cada carro.
