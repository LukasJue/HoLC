\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{htw}[2016/10/09 Roberts HTW class]

\LoadClass[12pt,a4paper]{article}

\RequirePackage[margin=1.2in]{geometry}
\RequirePackage{etoolbox}

% \RequirePackage{subfiles} % modular document

\RequirePackage{graphicx}
\RequirePackage{epstopdf}
\graphicspath{ {res/} }

\RequirePackage{float}
\RequirePackage[font=footnotesize,labelfont=bf]{caption}
\RequirePackage{subcaption}

\RequirePackage{hyperref}
\RequirePackage[german=guillemets]{csquotes}

%% Spelling

\RequirePackage{polyglossia}

\setdefaultlanguage[spelling=new]{german}


%% Font settings

\RequirePackage{fontspec} % font features
\RequirePackage{minted} % code hilighting

\defaultfontfeatures{Ligatures=TeX} % To support LaTeX quoting style
     % \setmainfont{Noto Serif}
    % \setsansfont{Noto Sans}
    \setmonofont{Iosevka Light}
    % \setmathfont[Digits,LatinhGreek]{}


%% Headers

\RequirePackage{fancyhdr}

\setlength{\headheight}{15.2pt}
\pagestyle{fancy}

\lhead[\@htw@course]{\@htw@title}
\rhead[\HTWBerlin]{\@htw@topic}


%% Custom commands

\newcommand\HTWBerlin{Hochschule für Technik und Wirtschaft Berlin}

% variables
% authors
\newcounter{cnt}
\newcommand\htwAddAuthor[2]{
    \stepcounter{cnt}
    \csdef{htw@author@first@\thecnt}{#1}
    \csdef{htw@author@last@\thecnt}{#2}
}
\newcommand\htwGetAuthor[1]{
    \csuse{htw@author@first@#1} \csuse{htwAuthor@last@#1}
}
\newcounter{rownum}
\newcommand\makeHtwAuthorList{
    \setcounter{rownum}{0}
    \whileboolexpr
        { test {\ifnumcomp{\value{rownum}}{<}{\thecnt}} }
        {
            \stepcounter{rownum}
            {\large
                \csuse{htw@author@first@\therownum}
                \textbf{\csuse{htw@author@last@\therownum}}
            }\\[0.3cm]
        }
}

\newcommand\htwCourse[1]{\def\@htw@course{#1}}
\newcommand\htwTopic[1]{\def\@htw@topic{#1}}
\newcommand\htwTitle[1]{\def\@htw@title{#1}}
\newcommand\htwSubtitle[1]{\def\@htw@subtitle{#1}}
\newcommand\htwDate[1]{\def\@htw@date{#1}}

% titlepage
\newcommand{\maketitlepage}{%

    \begin{figure}
        \begin{subfigure}{0.5\textwidth}

            \includegraphics[trim= 7mm 2mm 7mm 4mm,clip,height=1.5cm]{htw.eps}
            \hfill

        \end{subfigure}
        \begin{subfigure}{0.5\textwidth}

            \hfill
            \includegraphics[height=1.5cm]{ce.eps}

        \end{subfigure}
    \end{figure}

    %\vskip 60\p@

    \null\vfill
    \begin{center}

        \textsf{\textsc{\Large \@htw@course}}\\[1.5cm]
        {\Large \@htw@topic}\\[0.5cm]
        {\large \@htw@date}\\[2cm]
        {\textbf{\Huge \@htw@title}}\\[0.5cm]
        {\large \@htw@subtitle}

    \end{center}
    \null\vfill

    % Multiple Authors
    \begin{flushleft}
        \makeHtwAuthorList
    \end{flushleft}
    \@thanks
    \vfil\null
    \end{titlepage}
}
\renewcommand\maketitle{
    \begin{titlepage}
        \let\footnotesize\small
        \let\footnoterule\relax
        \let \footnote \thanks
        \maketitlepage
        \setcounter{footnote}{0}
        \global\let\thanks\relax
        \global\let\maketitle\relax
        \global\let\@thanks\@empty
        \global\let\@author\@empty
        \global\let\@date\@empty
        \global\let\@title\@empty
        \global\let\title\relax
        \global\let\author\relax
        \global\let\date\relax
        \global\let\and\relax
}
