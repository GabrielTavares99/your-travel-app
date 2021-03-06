# Sua Viagem App

O objetivo desse repositório é estudar/praticar a nova API de layout do Android, o **ConstraintLayout**.

**ConstraintLayout:** apresenta layout flat, ou seja, não possui mais
aquela hierarquia clássica do XML de componentes como nos layouts mais antigos, o que se traduz
em um ganho de perfomance.

**Importante:** a ordem dos componente é levado em consideração
no _component tree,_ o primeiro adicionado está ao fundo do que 
foi adicionado por último.

**API TOOLS:**
com ela é possível simular as _views_ por meio do preenchimento de dados fictícios oriundos de um 
arquivo JSON no diretório **sampledata**.

**Pegando recurso pelo nome do arquivo**
<br>
`Resources resources = context.getResources();`
<br>
`int idDrawable = resources.getIdentifier([nome recurso], [nome pasta(drawable)], context.getPackageName());`
<br>
`Drawable drawableImagemPacote = resources.getDrawable(idDrawable);`
<br>
`imageView.setImageDrawable(drawableImagemPacote);`

**Conversões**
<br>
O **pacote util** é bem interessante por conter alguns algoritmos simples de como **pegar algum**
**resource** ou realizar **formatações de moeda**.

![Imagem do aplicativo](app/images/tela-inteira.png)
