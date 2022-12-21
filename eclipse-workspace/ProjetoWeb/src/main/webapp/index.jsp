<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>ProsopografiaSP</title>
    <link href="https://fonts.googleapis.com/css2?family=Cinzel:wght@600&display=swap" rel="stylesheet">
    <link rel="icon" href="Imagens/Icone.jpg"/>
    <link rel="stylesheet" type="text/css" href="webapp/CSS.css" />
</head>

<body>
    <!-- HEADER -->
    
    <header>
        Prosopografia de São Paulo
        <p >Aluno: Marcos Guimarães Barreiros/ prontuário: GU3015181</p>
    </header>

    <main>
        <div class="barra_top">
            <ul>
                <li><a href="#top">Home</a></li>
                
                <li><a href="#Contato">Contato</a></li>
            </ul>
        </div>
       
        
          <!-- UPPER-PAGE -->
        
        <div class="container superior">


            <div class="busca_main">
                
                    <input type="text" size="50" min="2" max="50" id="campo_main" value="Digite um nome ou termo...">
                
               
                    <button type="menu" id="refinar">Refinar busca</button>
               
                
                    <button type="submit" id="busca">Buscar</button>
               

               

            </div>

            <div class="busca_refined">
                <select id="sel_genero">
                    <option value="" selected disabled>Escolha o gênero...</option>
                    <option value="opg_masc">Masculino</option>
                    <option value="opg_fem">Feminino</option>

                </select>

                <br/>
              
                <select id="sel_profis">
                    <option value="" selected disabled>Escolha uma área de ocupação...</option>
                    <option value="oppr_artes">Artes</option>
                    <option value="oppr_cienc">Ciências naturais</option>
                    <option value="oppr_eng">Engenharia</option>
                    <option value="oppr_dir">Direito</option>
                    <option value="oppr_ind">Indústria</option>
                    <option value="oppr_agro">Agricultura</option>
                    <option value="oppr_educ">Educação</option>
                    <option value="oppr_hum">Humanidades</option>
                    <option value="oppr_com">Comércio</option>
                    <option value="oppr_fin">Finanças</option>
                    <option value="oppr_psc">Pesca</option>
                    <option value="oppr_gov">Governo/política</option>
                    <option value="oppr_srt">Sertanismo</option>
                    <option value="oppr_mil">Militar</option>
                    <option value="oppr_med">Medicina</option>
                    <option value="oppr_igj">Cléro</option>
                    <option value="oppr_outro">Outras</option>
                </select>
                <br/>
                <select id="sel_epoca">
                    <option value="" selected disabled>Escolha uma época...</option>
                    <option value="opsec_pre_cabral">Pré-cabralina</option>
                    <option value="opsec_col">Brasil colônia</option>
                    <option value="opsec_imp">Império</option>
                    <option value="opsec_repvel">República velha</option>
                    <option value="opsec_varg">Era Vargas</option>
                    <option value="opsec_predit">Pré-ditadura</option>
                    <option value="opsec_dit">Ditadura militar</option>
                    <option value="opsec_novrep">Nova república</option>

                </select>
               <br/>
                <select id="sel_etnia">
                    <option value="" selected disabled>Escolha uma etnia...</option>
                    <option value="opet_asia">Asiático/a</option>
                    <option value="opet_branco">Branco/a</option>
                    <option value="opet_indig">Indígena</option>
                    <option value="opet_negro">Negro/a</option>
                    <option value="opet_outro">Outra</option>
                </select>


            </div>
        
    
            
            
            
           
            
           
           
    </div>  


        <!-- LOWER PAGE -->
    
    <br/>
        <div class="container sobre">
            
            <div id="sobre">
                <p id="p_sobre">
                    <h1>Sobre o Projeto</h1>
                    Prosopografia é o nome dado ao subcampo da historiografia dedicado ao estudo de grupos de pessoas por características biográficas comuns entre seus membros individuais. 
                     A Prosopografia de São Paulo pretende mapear informações biográficas de indivíduos que habitaram o estado de São Paulo durante séculos desde o período pré-cabralino até os dias atuais. 
                     Cada entrada sobre uma pessoa ou grupo de pessoas contém dados básicos como ocupação, causa de morte e composição familiar. 
                     Cada tipo de dado biográfico forma uma categoria de índice que conecta diferentes entradas por características em comum entre pessoas diferentes.
                </p>
                
        </div>

            <div class="container_anim"></div>

        

       

    </main>
    
    <!-- FOOTER -->
    
    <footer>
        <div id="Contato">
            Contato:
            Instituto Federal de São Paulo - Campus Guarulhos / Av. Salgado Filho, 3501 - Centro, Guarulhos - SP,
            07115-000
            telefone: (11) 2304-4250
            E-mail : Placeholder.aluno@ifsp.edu.br
        </div>
    </footer>
    <script src="script/jscript.js"></script>
</body>

</html>
