<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
    <div>
        用户中心
        主要是提供一个页面供用户进行与自己账号有关的操作 <br>
        其次是页面的布局，该vue界面提供用户最基本的信息及切换功能的列表选项 <br>
        实现功能的界面由右边的布局连接其他子vue完成
    </div>

    <RouterView />
</template>

