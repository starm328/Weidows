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
 * @LastEditTime: 2020-11-17 00:21:44
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

---

## 4.属性选择器(常用)

- 相当于 class + id 选择器

```HTML
<!--
 * @Author: Weidows
 * @Date: 2020-11-16 18:39:23
 * @LastEditors: Weidows
 * @LastEditTime: 2020-11-17 00:19:53
 * @FilePath: \Weidows\CSS\Study\选择器\属性选择器\1.HTML
 * @Description:
-->
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>
      /* 选中demo类下的a标签
      这个不是讲解,这个只是页面初始化,好看些 */
      .demo a {
        float: left;
        display: block;
        height: 50px;
        width: 50px;
        border-radius: 10px;
        background: violet;
        text-align: center;
        color: gainsboro;
        text-decoration: none;
        margin-right: 10px;
        font: bold 20px/50px Arial;
      }

      /*
      = 是绝对等于
      *= 是包含
      ^= 以这个开头
      $= 以这个结尾
      */

      /* 选中存在id属性的元素 */
      a[id] {
        /* background: yellow; */
      }

      /* 选中对应属性的元素(属性值可以使用正则表达式!!!) */
      a[id="first"] {
        /* background: yellow; */
      }

      /* 选中class中有links的元素 */
      a[class*="links"] {
        /* background: yellow; */
      }

      /* 以http开头的元素 */
      a[herf^="http"] {
        /* background: yellow; */
      }

      /* 以pdf结尾 */
      a[herf$="pdf"] {
        /* background: yellow; */
      }
    </style>
  </head>
  <body>
    <p class="demo">
      <a href="https://www.baidu.com" class="links item first" id="first">1</a>
      <a
        href="http://blog.kuangstudy.com"
        class="links item active"
        target="_blank"
        title="test"
        >2</a
      >
      <a here="images/123.html" class="links item">3</a>
      <a here="images/123.png" class="links item">4</a>
      <a here="images/123.jpg" class="links item">5</a>
      <a here="abc" class="links item">6</a>
      <a here="/a.pdf" class="links item">7</a>
      <a here="/abc.pdf" class="links item">8</a>
      <a here="abc.doc" class="links item">9</a>
      <a here="abcd.doc" class="links item">10</a>
    </p>
  </body>
</html>
```
