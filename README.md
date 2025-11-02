<h1 align="center">Engenharia de Software</h1>
<h1>1. Primeiro Trecho -Software Engineering at Google, Oreilly.</h1>

O texto discute as diferenças fundamentais entre programação, ciência da computação e engenharia de software, que muitas vezes são tratadas como sinônimos, mas na verdade têm focos bem distintos.
A ciência da computação é voltada para o lado teórico — algoritmos, estruturas de dados, e princípios matemáticos que sustentam a tecnologia.
A programação é a prática de transformar essas ideias em código executável.
Já a engenharia de software é a aplicação sistemática de conhecimento técnico e boas práticas para construir sistemas reais, escaláveis e confiáveis.

O texto também compara a engenharia de software com outras engenharias tradicionais, como a civil ou a aeronáutica, nas quais existem processos rigorosos e consequências físicas diretas — um erro em uma ponte ou avião pode causar danos concretos.
O software, por outro lado, é intangível: ele não ocupa espaço físico nem pode ser tocado, mas seus efeitos são muito reais. Um simples erro de código pode afetar milhões de pessoas — como uma falha em um aplicativo bancário que impede saques ou um bug em um sistema hospitalar que compromete dados de pacientes.

Por isso, a engenharia de software precisa buscar o mesmo rigor e responsabilidade das engenharias tradicionais, já que hoje a maior parte do mundo depende de sistemas digitais confiáveis. O objetivo é que desenvolvedores adotem práticas mais sérias, éticas e sustentáveis — projetando não apenas para o presente, mas também para o futuro.

<h1>2. Segundo Trecho -Software Engineering at Google, Oreilly.</h1>

A engenharia de software vai muito além de simplesmente escrever código. Ela envolve todo o ciclo de vida do software — ferramentas, processos, manutenção, escalabilidade e decisões estratégicas que garantem que o sistema continue útil e saudável ao longo do tempo.

Um conceito central é o de “programação integrada ao longo do tempo”. Isso significa que não basta criar algo que funcione hoje: o software precisa ser capaz de evoluir, se adaptar a novas necessidades e ser compreendido por outras pessoas no futuro. Um sistema bem projetado é aquele que envelhece bem — que pode ser atualizado sem quebrar tudo, e que continua fazendo sentido mesmo anos depois da sua criação.

<h1>3. Exemplos de Trade-Offs com Situações Reais:</h1>

Velocidade de desenvolvimento vs. qualidade do código
Trade-off: Às vezes é preciso desenvolver algo rapidamente — por exemplo, quando uma startup lança uma nova versão do aplicativo para aproveitar uma oportunidade de mercado.
Impacto: O código escrito às pressas pode acumular “dívida técnica”, tornando o sistema frágil e difícil de manter. Um caso real é o do Twitter, que em seus primeiros anos priorizou velocidade de entrega e depois teve que reescrever partes críticas do sistema para corrigir falhas de escalabilidade e performance.

Reutilização de código vs. complexidade
Trade-off: Criar bibliotecas genéricas e reutilizáveis é ótimo para projetos grandes, mas pode ser um exagero em contextos simples.
Impacto: Em um projeto pequeno, como o site de uma empresa local, tentar aplicar padrões excessivamente genéricos pode tornar o código mais difícil de entender e manter. Por outro lado, empresas como Google e Microsoft dependem fortemente de componentes reutilizáveis para manter consistência entre centenas de produtos — o que mostra que o equilíbrio depende da escala e do contexto.

Otimização de desempenho vs. legibilidade
Trade-off: Tornar um sistema mais rápido às vezes exige técnicas complexas, como processamento paralelo ou caching agressivo.
Impacto: Isso pode dificultar a compreensão do código por outros desenvolvedores. Um exemplo real é o caso do Google Chrome, que utiliza múltiplos processos e otimizações profundas para desempenho — o que torna o código extremamente eficiente, mas também muito mais complexo de entender e manter.

<h1>4. Diagrama UML</h1>
 <img src="Engenharia de Software/UML.png" width="800">

<h1>5. Java</h1>
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

<h1>6. Testes Automatizados</h1>

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

<h1>7. SQL Lite - ProjetoBiblioteca</h1>
<h3>🧑‍🎓 Aluno</h3>
<pre><code class="language-java">
    package com.example.biblioteca;

public class Aluno {
    private String nome;
    private String ra;

    public Aluno() {}

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRa() { return ra; }
    public void setRa(String ra) { this.ra = ra; }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', ra='" + ra + "'}";
    }
}

</code></pre>

<h3>📚 Biblioteca</h3>
<pre><code class="language-java">
     package com.example.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<>();

    public void addLivro(Livro l) {
        if (l != null) livros.add(l);
    }

    public List<Livro> listar() {
        return Collections.unmodifiableList(livros);
    }
}

</code></pre>

<h3>🗄️ Database</h3>
<pre><code class="language-java">
    package com.example.biblioteca;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final String url;

    public Database(String url) {
        this.url = url;
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public void criarTabelaSeNecessario() {
        String sql = "CREATE TABLE IF NOT EXISTS livros ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "titulo TEXT NOT NULL,"
                + "autor TEXT"
                + ");";
        try (Connection c = connect(); Statement s = c.createStatement()) {
            s.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar tabela: " + e.getMessage(), e);
        }
    }

    public int inserirLivro(Livro l) {
        String sql = "INSERT INTO livros(titulo, autor) VALUES(?,?)";
        try (Connection c = connect(); PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getAutor());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) return rs.getInt(1);
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir livro: " + e.getMessage(), e);
        }
    }

    public List<Livro> listarLivros() {
        String sql = "SELECT id, titulo, autor FROM livros ORDER BY id";
        List<Livro> out = new ArrayList<>();
        try (Connection c = connect(); Statement s = c.createStatement(); ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                out.add(new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor")));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar livros: " + e.getMessage(), e);
        }
        return out;
    }

    public List<Livro> buscarPorTitulo(String termo) {
        String sql = "SELECT id, titulo, autor FROM livros WHERE titulo LIKE ? ORDER BY id";
        List<Livro> out = new ArrayList<>();
        try (Connection c = connect(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, "%" + termo + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    out.add(new Livro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor")));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar livros: " + e.getMessage(), e);
        }
        return out;
    }
}

}
</code></pre>

<h3>📖 Livro</h3>
<pre><code class="language-java">
   package com.example.biblioteca;

public class Livro {
    private Integer id;
    private String titulo;
    private String autor;

    public Livro() {}
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public Livro(Integer id, String titulo, String autor) {
        this.id = id; this.titulo = titulo; this.autor = autor;
    }
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public String toString() {
        return "Livro{id=" + id + ", titulo='" + titulo + "', autor='" + autor + "'}";
    }
}

</code></pre>

<h3>🏫 Sala de Aula</h3>
<pre><code class="language-java">
    package com.example.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaDeAula {
    private String nome;
    private final List<Aluno> alunos = new ArrayList<>();

    public SalaDeAula() {}
    public SalaDeAula(String nome) { this.nome = nome; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public void adicionarAluno(Aluno a) { if (a != null) alunos.add(a); }
    public List<Aluno> listarAlunos() { return Collections.unmodifiableList(alunos); }

    @Override
    public String toString() {
        return "SalaDeAula{nome='" + nome + "', alunos=" + alunos + "}";
    }
}

</code></pre>

<h3>👤 Usuário</h3>
<pre><code class="language-java">
   package com.example.biblioteca;

public class Usuario {
    private String nome;

    public Usuario() {}
    public Usuario(String nome) { this.nome = nome; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() { return "Usuario{nome='" + nome + "'}"; }
}

</code></pre>

<h3>▶️ Main</h3>
<pre><code class="language-java">
    package com.example.biblioteca;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Iniciando demonstração Biblioteca + SQLite ==");

        SalaDeAula sala = new SalaDeAula("Sala 101");
        sala.adicionarAluno(new Aluno("Ted Mosby", "20250001"));
        sala.adicionarAluno(new Aluno("Barney Stinson", "20250002"));
        System.out.println("Alunos na " + sala.getNome() + ": " + sala.listarAlunos());

        Biblioteca bib = new Biblioteca();
        bib.addLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        bib.addLivro(new Livro("Java: Como Programar", "Deitel"));
        System.out.println("Livros em memória: " + bib.listar());

        try {
            String dbFile = "biblioteca.db";
            Path p = Path.of(dbFile);
            if (!Files.exists(p)) Files.createFile(p);

            String url = "jdbc:sqlite:" + dbFile;
            Database db = new Database(url);
            db.criarTabelaSeNecessario();

            Livro l1 = new Livro("Introdução ao Java", "Autor A");
            int id1 = db.inserirLivro(l1);
            System.out.println("Inserido livro id=" + id1 + ": " + l1.getTitulo());

            Livro l2 = new Livro("Estruturas de Dados", "Autor B");
            int id2 = db.inserirLivro(l2);
            System.out.println("Inserido livro id=" + id2 + ": " + l2.getTitulo());

            List<Livro> todos = db.listarLivros();
            System.out.println("Livros no banco: " + todos);

            List<Livro> busca = db.buscarPorTitulo("Java");
            System.out.println("Busca por 'Java': " + busca);

        } catch (Exception e) {
            System.err.println("Erro na demo SQLite: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("== Fim da demonstração ==");
    }
}

</code></pre>


<h1>8. Ollhama</h1>
<pre><code class="language-java">
  import java.io.*;
import java.net.*;

public class OllamaExample {
    public static void main(String[] args) {
        try {
           
            URL url = new URL("http://127.0.0.1:11434/api/generate");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

           
            String jsonInput = """
                {
                  "model": "codellama:7b",
                  "prompt": "Escreva uma função em Java que inverta uma string.",
                  "stream": false
                }
                """;

            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInput.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int status = conn.getResponseCode();
            System.out.println("HTTP Status: " + status);
            
            InputStream responseStream = (status >= 200 && status < 300)
                    ? conn.getInputStream()
                    : conn.getErrorStream();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(responseStream, "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line.trim());
                }
                System.out.println("Resposta do Ollama:");
                System.out.println(response.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

</code></pre>

 
