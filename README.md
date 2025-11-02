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
 <img src="Engenharia de Software/UML.png" width="800">

<h2>5. Java</h2>
<h3> Cliente </h3>
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
</code></pre>

<h3> Produto </h3>
<pre><code class="language-java">
 public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(int codigo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos
    public void atualizarEstoque(int novaQuantidade) {
        this.quantidadeEstoque = novaQuantidade;
        System.out.println("Estoque do produto " + nome + " atualizado para " + novaQuantidade + " unidades.");
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
</code></pre>

<h3>Venda</h3>
<pre><code class="language-java">
import java.util.Date;
import java.util.List;

public class Venda {
    private int numero;
    private Date data;
    private double valorTotal;
    private List<Produto> produtos;

    // Construtor
    public Venda(int numero, Date data, List<Produto> produtos) {
        this.numero = numero;
        this.data = data;
        this.produtos = produtos;
        this.valorTotal = calcularTotal();
    }

    // Métodos
    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        this.valorTotal = total;
        return total;
    }

    public void gerarNotaFiscal() {
        System.out.println("Nota Fiscal da Venda nº " + numero);
        System.out.println("Data: " + data);
        for (Produto p : produtos) {
            System.out.println("- " + p.getNome() + " | R$ " + p.getPreco());
        }
        System.out.println("Total: R$ " + valorTotal);
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
</code></pre>

<h3> Main </h3>
<pre><code class="language-java">
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Arroz", 10.5, 50);
        Produto p2 = new Produto(2, "Feijão", 8.0, 30);

        Cliente cliente = new Cliente("Luan", "luan@email.com", "Compra semanal", 200);
        cliente.registrar();

        List<Produto> produtos = Arrays.asList(p1, p2);

        Venda venda = new Venda(1001, new Date(), produtos);
        venda.gerarNotaFiscal();
    }
}
</code></pre>

<h2>6. Testes Automatizados</h2>

<h3>Cliente </h3> 
<pre><code class="language-java">
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testRegistrar() {
        Cliente cliente = new Cliente("Luan", "luan@email.com", "Compra mensal", 100);
        assertEquals("Luan", cliente.getNomeCliente());
        assertEquals(100, cliente.getSaldo());
    }

    @Test
    public void testAtualizarPerfil() {
        Cliente cliente = new Cliente("Maria", "maria@teste.com", "Primeira compra", 50);
        cliente.atualizarPerfil("maria@nova.com", 80);
        assertEquals("maria@nova.com", cliente.getEmail());
        assertEquals(80, cliente.getSaldo());
    }

    @Test
    public void testDeletarPerfil() {
        Cliente cliente = new Cliente("Carlos", "carlos@teste.com", "Compra única", 30);
        assertDoesNotThrow(cliente::deletarPerfil);
    }
}
</code></pre>

<h3> Produto </h3>
<pre><code class="language-java">
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testCriacaoProduto() {
        Produto produto = new Produto(1, "Arroz", 10.5, 100);
        assertEquals(1, produto.getCodigo());
        assertEquals("Arroz", produto.getNome());
        assertEquals(10.5, produto.getPreco());
        assertEquals(100, produto.getQuantidadeEstoque());
    }

    @Test
    public void testAtualizarEstoque() {
        Produto produto = new Produto(2, "Feijão", 8.0, 50);
        produto.atualizarEstoque(70);
        assertEquals(70, produto.getQuantidadeEstoque());
    }
}
</code></pre>

<h3> Venda </h3>
<pre><code class="language-java">
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class VendaTest {

    @Test
    public void testCalcularTotal() {
        Produto p1 = new Produto(1, "Arroz", 10.0, 10);
        Produto p2 = new Produto(2, "Feijão", 8.0, 5);

        List<Produto> produtos = Arrays.asList(p1, p2);
        Venda venda = new Venda(1001, new Date(), produtos);

        double totalEsperado = 18.0;
        assertEquals(totalEsperado, venda.calcularTotal());
    }

    @Test
    public void testGerarNotaFiscal() {
        Produto p1 = new Produto(3, "Leite", 5.5, 20);
        List<Produto> produtos = Collections.singletonList(p1);

        Venda venda = new Venda(2002, new Date(), produtos);
        assertDoesNotThrow(venda::gerarNotaFiscal);
    }

    @Test
    public void testSettersAndGetters() {
        Venda venda = new Venda(3003, new Date(), new ArrayList<>());
        venda.setValorTotal(50.0);
        assertEquals(50.0, venda.getValorTotal());
    }
</code></pre>

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

 
