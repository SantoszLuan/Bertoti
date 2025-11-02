<h1 align="center">Engenharia de Software</h1>
<h2>1. Primeiro Trecho -Software Engineering at Google, Oreilly.</h2>

O texto discute as diferenças fundamentais entre programação, ciência da computação e engenharia de software, que muitas vezes são tratadas como sinônimos, mas na verdade têm focos bem distintos.
A ciência da computação é voltada para o lado teórico — algoritmos, estruturas de dados, e princípios matemáticos que sustentam a tecnologia.
A programação é a prática de transformar essas ideias em código executável.
Já a engenharia de software é a aplicação sistemática de conhecimento técnico e boas práticas para construir sistemas reais, escaláveis e confiáveis.

O texto também compara a engenharia de software com outras engenharias tradicionais, como a civil ou a aeronáutica, nas quais existem processos rigorosos e consequências físicas diretas — um erro em uma ponte ou avião pode causar danos concretos.
O software, por outro lado, é intangível: ele não ocupa espaço físico nem pode ser tocado, mas seus efeitos são muito reais. Um simples erro de código pode afetar milhões de pessoas — como uma falha em um aplicativo bancário que impede saques ou um bug em um sistema hospitalar que compromete dados de pacientes.

Por isso, a engenharia de software precisa buscar o mesmo rigor e responsabilidade das engenharias tradicionais, já que hoje a maior parte do mundo depende de sistemas digitais confiáveis. O objetivo é que desenvolvedores adotem práticas mais sérias, éticas e sustentáveis — projetando não apenas para o presente, mas também para o futuro.

<h2>2. Segundo Trecho -Software Engineering at Google, Oreilly.</h2>

A engenharia de software vai muito além de simplesmente escrever código. Ela envolve todo o ciclo de vida do software — ferramentas, processos, manutenção, escalabilidade e decisões estratégicas que garantem que o sistema continue útil e saudável ao longo do tempo.

Um conceito central é o de “programação integrada ao longo do tempo”. Isso significa que não basta criar algo que funcione hoje: o software precisa ser capaz de evoluir, se adaptar a novas necessidades e ser compreendido por outras pessoas no futuro. Um sistema bem projetado é aquele que envelhece bem — que pode ser atualizado sem quebrar tudo, e que continua fazendo sentido mesmo anos depois da sua criação.

<h2>3. Exemplos de Trade-Offs com Situações Reais:</h2>

Velocidade de desenvolvimento vs. qualidade do código
Trade-off: Às vezes é preciso desenvolver algo rapidamente — por exemplo, quando uma startup lança uma nova versão do aplicativo para aproveitar uma oportunidade de mercado.
Impacto: O código escrito às pressas pode acumular “dívida técnica”, tornando o sistema frágil e difícil de manter. Um caso real é o do Twitter, que em seus primeiros anos priorizou velocidade de entrega e depois teve que reescrever partes críticas do sistema para corrigir falhas de escalabilidade e performance.

Reutilização de código vs. complexidade
Trade-off: Criar bibliotecas genéricas e reutilizáveis é ótimo para projetos grandes, mas pode ser um exagero em contextos simples.
Impacto: Em um projeto pequeno, como o site de uma empresa local, tentar aplicar padrões excessivamente genéricos pode tornar o código mais difícil de entender e manter. Por outro lado, empresas como Google e Microsoft dependem fortemente de componentes reutilizáveis para manter consistência entre centenas de produtos — o que mostra que o equilíbrio depende da escala e do contexto.

Otimização de desempenho vs. legibilidade
Trade-off: Tornar um sistema mais rápido às vezes exige técnicas complexas, como processamento paralelo ou caching agressivo.
Impacto: Isso pode dificultar a compreensão do código por outros desenvolvedores. Um exemplo real é o caso do Google Chrome, que utiliza múltiplos processos e otimizações profundas para desempenho — o que torna o código extremamente eficiente, mas também muito mais complexo de entender e manter.

<h2>4. Diagrama UML</h2>
 <img src="Engenharia de Software/UML.jpg" width="600">

<h2>5. Java</h2>
<h1> Cliente </h1>
 <pre><code class="language-java">
public class Cliente {
    private String nomeCliente;
    private String email;
    private String infoCompras;
    private float saldo;

    // Construtor
    public Cliente(String nomeCliente, String email, String infoCompras, float saldo) {
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.infoCompras = infoCompras;
        this.saldo = saldo;
    }

    // Métodos
    public void registrar() {
        System.out.println("Cliente " + nomeCliente + " registrado com sucesso!");
    }

    public void deletarPerfil() {
        System.out.println("Perfil do cliente " + nomeCliente + " foi deletado.");
    }

    public void atualizarPerfil(String novoEmail, float novoSaldo) {
        this.email = novoEmail;
        this.saldo = novoSaldo;
        System.out.println("Perfil do cliente " + nomeCliente + " atualizado.");
    }

    // Getters e Setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfoCompras() {
        return infoCompras;
    }

    public void setInfoCompras(String infoCompras) {
        this.infoCompras = infoCompras;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
}
</code></pre>

<h2>6. Testes Automatizados</h2>

<table>
  <tr>
    <td><img src="Engenharia de Software/Teste_Cidade.png" width="600"></td>
    <td><img src="Engenharia de Software/Teste_Predio.png" width="600"></td>
    <td><img src="Engenharia de Software/Teste_Personagem.png" width="600"></td>
  </tr>
</table>

<h2>7. SQL Lite - ProjetoBiblioteca</h2>
<h3>🧑‍🎓 Aluno</h3>
<img src="Engenharia de Software/Aluno.png" width="500">

<h3>📚 Biblioteca</h3>
<img src="Engenharia de Software/Biblioteca.png" width="500">

<h3>🗄️ Database</h3>
<img src="Engenharia de Software/Database_1.png" width="500">
<img src="Engenharia de Software/Database_2.png" width="500">

<h3>📖 Livro</h3>
<img src="Engenharia de Software/Livro.png" width="500">

<h3>🏫 Sala de Aula</h3>
<img src="Engenharia de Software/SaladeAula.png" width="500">

<h3>👤 Usuário</h3>
<img src="Engenharia de Software/Usuario.png" width="500">

<h3>▶️ Main</h3>
<img src="Engenharia de Software/Main.png" width="500">


<h2>8. Ollhama</h2>
<img src="Engenharia de Software/Ollama.png" width="700">

 
