<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
    <HEAD><TITLE>Accessing Bean Properties</TITLE>
        <LINK REL=STYLESHEET
              HREF="el/JSP-Styles.css"
              TYPE="text/css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/video.ico" type="image/x-icon">
    </head>
    <BODY>
        <TABLE BORDER=5 ALIGN="CENTER">
            <TR><TH CLASS="TITLE">
                    Accessing Bean Properties
        </TABLE>
        <P>
        <UL>
            <LI><B>First Name:</B> ${usuario.nomeCompleto}
            <LI><B>Last Name:</B> ${usuario.apelido}
            <LI><B>Company Name:</B> ${usuario.email}
            <LI><B>Company Business:</B> ${usuario.senha}
        </UL>
        <a href="index.html">Voltar</a>
    </BODY>
</HTML>