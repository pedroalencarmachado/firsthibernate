
package main;

import dao.DAO;
import java.util.Date;
import mapeamentos.TesteData;

/**
 *
 * @author ar_or
 */
public class FirstHibernate {
    public static void main(String[] args) {
        /*Inserindo Tipo Eletrico
        DAO dao = new DAO();
        Tipo tipo = new Tipo();
        tipo.setNome("Eletrico");
        dao.salvar(tipo);
        */
        
        
        /*Inserido Pokemon Pikachu - Eletrico
        DAO dao = new DAO();
        Tipo tipo = (Tipo) dao.consultar(Tipo.class).get(0);
        Pokemon pokemon = new Pokemon();
        pokemon.setNome("Raichu");
        pokemon.setTipo(tipo);
        tipo.setPokemons(new ArrayList());
        tipo.getPokemons().add(pokemon);
        dao.salvar(pokemon);
        */
        /*Inserido Pokemon Raichu - Eletrico
        DAO dao = new DAO();
        Tipo tipo = (Tipo) dao.consultar(Tipo.class).get(0);
        Pokemon pokemon = new Pokemon();
        pokemon.setNome("Raichu");
        pokemon.setTipo(tipo);
        tipo.setPokemons(new ArrayList());
        tipo.getPokemons().add(pokemon);
        dao.salvar(pokemon);
        */
        
        /*Consultar Tipo
        DAO dao = new DAO ();
        Tipo t = (Tipo) dao.consultar(Tipo.class).get(0);
        System.out.println(t.getNome());
        */
        
        /*Consulta todos os pokemons do tipo Eletrico
        DAOPokemon dao = new DAOPokemon();
        Pokemon p = (Pokemon) dao.consultaPokemonPorTipo("Eletrico").get(0);
        System.out.println(p.getNome());
        System.out.println(p.getTipo().getNome());
        */
        
        /*Cadastrar treinador e endereço
        DAO dao = new DAO();
        Treinador treinador = new Treinador();
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setNumero(129);
        endereco.setTreinador(treinador);
        treinador.setEndereco(endereco);
        treinador.setNome("Ash");
        dao.salvar(treinador.getEndereco());
        dao.salvar(treinador);
        */
        /*Consultando treinador
        DAO dao = new DAO ();
        Treinador treinador = (Treinador) dao.consultar(Treinador.class).get(0);
        System.out.println(treinador.getNome());
        System.out.println(treinador.getEndereco().getRua());
        */
        /*Cadastrando um dado na tabela treina (n para n)
        DAO dao = new DAO();
        Treinador treinador = (Treinador) dao.consultar(Treinador.class).get(0);
        Pokemon pokemon = (Pokemon) dao.consultar(Pokemon.class).get(0);
        Treina treina = new Treina();
        treina.setChaveComposta(new TreinaPk());
        treina.getChaveComposta().setPokemon(pokemon);
        treina.getChaveComposta().setTreinador(treinador);
        dao.salvar(treina);
        */
        /*Consulta Treina por Pokemon
        DAOTreina dao = new DAOTreina();
        Pokemon pokemon = (Pokemon) dao.consultar(Pokemon.class).get(0);
        System.out.println(dao.consultaTreinaPorPokemon(pokemon).get(0));
        Treina treina = (Treina) dao.consultaTreinaPorPokemon(pokemon).get(0);
        System.out.println(treina.getChaveComposta().getTreinador().getNome());
        System.out.println(treina.getChaveComposta().getTreinador().getEndereco().getRua());
        */
        
        /*Query by Example
        //http://blog.caelum.com.br/simplifique-suas-consultas-com-o-query-by-example-do-hibernate/
        DAO dao = new DAO();
        Treina treina = new Treina();
        treina.setNota(7);
        List lista = dao.consultaByExemplo(Treina.class,treina);
        System.out.println(lista.size());
        if (lista.size()>0){
            treina = (Treina) lista.get(0);
            System.out.println(treina.getChaveComposta().getTreinador().getNome());
        }
        */
        
        /*Consulta treina com nota maior que 1
        DAOTreina dao = new DAOTreina();
        Treina treina = (Treina) dao.consultaPorNotaMaior(1).get(0);
        System.out.println(treina.getChaveComposta().getTreinador().getNome());
        */
        
        /*Inserindo e consultado dado com Data @Temporal
        TesteData td = new TesteData();
        DAO dao = new DAO();
        td.setCodTestData(120);
        td.setDate(new Date());
        dao.salvar(td);
                
        td = (TesteData) dao.consultar(TesteData.class).get(0);
        System.out.println(td.getDate());
        */
        
    }
}
