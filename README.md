# Md2Html
## Parser from Markdown to HTML.

### The converter supports the following features:

1. Text paragraphs are separated by empty lines.

1. Inline markup elements: selection (* or _), strong selection (** or __), strikethrough (--), code (`)

1. Headings (# * title level)

1. \`++подчеркивания++\`: \`<u>подчеркивания</u>\`

### The converter calls md2html.Md2Html and takes two arguments: the name of the input file with Markdown markup and the name of the output file with HTML markup. Both files are UTF-8 encoded.

### Example:
#### Input File:\
\# Заголовок первого уровня

\## Второго

\### Третьего \#\# уровня

\#### Четвертого
\# Все еще четвертого

Этот абзац текста,
содержит две строки.

   \# Может показаться, что это заголовок.
Но нет, это абзац начинающийся с \`\#`.

\#И это не заголовок.

\###### Заголовки могут быть многострочными
(и с пропуском заголовков предыдущих уровней)
Мы все любим \*выделять\* текст \_разными\_ способами.  
\*\*Сильное выделение\*\*, используется гораздо реже,  
но \_\_почему бы и нет\_\_?  
Немного \-\-зачеркивания\-\- еще ни кому не вредило.  
Код представляется элементом \`code\`.

Обратите внимание, как экранируются специальные  
HTML-символы, такие как \<, \> и \&.

Знаете ли вы, что в Markdown, одиночные \* и \_  
не означают выделение?  
Они так же могут быть заэкранированы  
при помощи обратного слэша: \\*.



Лишние пустые строки должны игнорироваться.

Любите ли вы \*вложеные \_\_выделения\_\_\* так,
как \_\_--люблю--\_\_ их я?

#### Output File:            
<h1>Заголовок первого уровня</h1>
<h2>Второго</h2>
<h3>Третьего ## уровня</h3>
<h4>Четвертого
# Все еще четвертого</h4>
<p>Этот абзац текста,
содержит две строки.</p>
<p>    # Может показаться, что это заголовок.
Но нет, это абзац начинающийся с <code>#</code>.</p>
<p>#И это не заголовок.</p>
<h6>Заголовки могут быть многострочными
(и с пропуском заголовков предыдущих уровней)</h6>
<p>Мы все любим <em>выделять</em> текст <em>разными</em> способами.
<strong>Сильное выделение</strong>, используется гораздо реже,
но <strong>почему бы и нет</strong>?
Немного <s>зачеркивания</s> еще ни кому не вредило.
Код представляется элементом <code>code</code>.</p>
<p>Обратите внимание, как экранируются специальные
HTML-символы, такие как <code>&lt;</code>, <code>&gt;</code> и <code>&amp;</code>.</p>
<p>Знаете ли вы, что в Markdown, одиночные * и _
не означают выделение?
Они так же могут быть заэкранированы
при помощи обратного слэша: *.</p>
<p>Лишние пустые строки должны игнорироваться.</p>
<p>Любите ли вы <em>вложеные <strong>выделения</strong></em> так,
как <strong><s>люблю</s></strong> их я?</p>
            
Реальная разметка
