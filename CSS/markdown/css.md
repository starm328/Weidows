---
title: CSS学习笔记
categories:
  - experience
  - css
tags:
  - CSS
  - 备忘录
cover: https://cdn.jsdelivr.net/gh/Weidows/Images/
# top_img: https://cdn.jsdelivr.net/gh/Weidows/Images/
---

<!--
 * @Author: Weidows
 * @LastEditors: Weidows
 * @LastEditTime: 2020-11-16 01:18:23
 * @FilePath: \Weidows\CSS\markdown\css.md
-->

# 一.需要了解的

- 前端分离有利于 SEO 优化,便于搜索引擎收录
  - Vue 框架极其难被收录
  - 因为 Vue 框架加载时需要执行 JavaScript 来引入 HTML,CSS 或者 JavaScript,而搜索引擎的爬虫并不会执行,所以像是这种框架写出来的页面,本身就是个空壳,爬虫爬不到关键性的内容,所以 SEO 比较弱.

---

# 二.样式引入

- 优先级: 行内样式>内部样式>外部样式

## 1.内部样式

```css
<style>

</style>
```

---

## 2.外部样式

- 链接式(css3)

```css
<link rel="stylesheet" href="CSS/1.css" />
```

- 导入式(不建议使用,css2 中的)

```css
<style>
  @import url("CSS/1.css");
</style>
```

## 3.行内样式

```css
<h1 style="color:aqua">行内样式</h1>
```

---

# 三.选择器

## 1.基本选择器

- 优先级: id > class > 标签

### 1.1 标签选择器

```css
div {
  color: aqua;
}
```

### 1.2 类选择器

```css
.Span {
  color: chartreuse;
}
```

### 1.3 id 选择器

- id 必须保证全局唯一

```css
#Div-3 {
  color: blueviolet;
}
```

---

## 2.层次选择器

### 2.1 后代选择器

- 在某个元素的后面所有

```css
/* 对于ul后面的所有p标签 */
ul p {
  background: red;
}
```

### 2.2 子选择器

- 只选择后面的一代

```css
/* 对于body里面第一代的p标签 */
body > p {
  background: green;
}
```

### 2.3 相邻(兄弟)选择器

- 对于选中的标签的下一个同级标签

```css
#action + p {
  background: tomato;
}
```

- 类似上面,这个是选择后面所有的同级标签

### 2.4 通用(兄弟)选择器

```css
#action ~ p {
  background: orange;
}
```

---

## 3.结构伪类选择器

```html
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <!-- 避免使用class,id选择器 -->
    <style>
      /* ul的第一个子元素 */
      ul li:first-child {
        background: violet;
      }

      /* ul的最后一个子元素 */
      ul li:last-child {
        background: yellow;
      }

      /* 选中父级第一个元素(p1) */
      p:nth-child(1) {
        background: rgb(255, 0, 255);
      }

      /* 选中父级第二个类型为p的元素 */
      p:nth-of-type(2) {
        background: wheat;
      }

      /* 鼠标悬浮 */
      p:hover {
        background: black;
      }
    </style>
  </head>
  <body>
    <p>p1</p>
    <p>p2</p>
    <p>p3</p>
    <ul>
      <li>li1</li>
      <li>li2</li>
      <li>li3</li>
    </ul>
  </body>
</html>
```
