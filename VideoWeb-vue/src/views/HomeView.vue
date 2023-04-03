<script>
import { proxyRefs } from 'vue';
import TheWelcome from '../components/TheWelcome.vue';
import request from '../request';
import { ElNotification } from 'element-plus'

export default{
  name:"login",
  data() {

  },
  methods: {
    getUser() {
      request.get('/user/list').then(res => {
        if(res.code === '200') {
          ElNotification({
          title: 'Success',
          message: 'This is a success message',
          type: 'success',
          })
        }else{
          ElNotification({
          title: 'Success',
          message: 'This is a success message',
          type: 'error',
          })
        }
      })
    }
  }
}
</script>

<template>
  <!-- <main>
    <TheWelcome />
  </main> -->

  这是一个主页
  <div>
    <el-button type="primary" @click="getUser">Primary</el-button>
  </div>
</template>


