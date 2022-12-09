
/* Faça um programa que retorne a 
data da entrada com o mês por extenso;*/

let entrada = DataExtenso("02/02/2019")

function DataExtenso(data_informada) {
    meses = new Array("Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro");
    var dia_informado = data_informada.split('/')[0];
    var mes_informado = data_informada.split('/')[1];
    var ano_informado = data_informada.split('/')[2];
    var data = ano_informado + '-' + mes_informado + '-' + dia_informado + " 00:00:00";
    var dataInfo = new Date(data);
    var dia = dataInfo.getDate();
    var mes = dataInfo.getMonth();
    var ano = dataInfo.getFullYear();
    
    if(dia < 10) {
        dia = '0' + dia
    }
    var diaext = dia + " de " + meses[mes] + " de " + ano;
    
    return diaext;
}
   console.log(entrada); 

   
