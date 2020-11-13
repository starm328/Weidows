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
 * @LastEditTime: 2020-11-13 12:12:53
 * @FilePath: \Weidows\CSS\Study\markdown\css.md
-->

# 需要了解的

- 前端分离有利于 SEO 优化,便于搜索引擎收录
  - Vue 框架极其难被收录
  - 因为 Vue 框架加载时需要执行 JavaScript 来引入 HTML,CSS 或者 JavaScript,而搜索引擎的爬虫并不会执行,所以像是这种框架写出来的页面,本身就是个空壳,爬虫爬不到关键性的内容,所以 SEO 比较弱.

---

# 样式引入

## 优先级: 行内样式>内部样式>外部样式

- 内部样式

  ```css
  <style>

  </style>
  ```

  ***

- 外部样式

  - 链接式(css3)

  ```css
  <link rel="stylesheet" href="CSS/1.css" />
  ```

  ***

  - 导入式(不建议使用,css2 中的)

  ```css
  <style>
    @import url("CSS/1.css");
  </style>
  ```

  ***

- 行内样式

  ```css
  <h1 style="color:aqua">行内样式</h1>
  ```

---

# 选择器

## 1.基本选择器

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
