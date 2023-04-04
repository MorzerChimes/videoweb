import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/home',
      name: 'home',
      component: HomeView
    },
    {
      path: '/',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    {
      //有关用户操作的总路由
      path: '/user',
      name: 'user',
      component: () => import('../views/user/user.vue'),
      children: [
        {
          // 用户中心
          path: '',
          name: 'userCenter',
          component: () => import('../views/user/userCenter.vue')
        },
        {
          // 创作中心
          path: 'craftCenter',
          name: 'craftCenter',
          component: () => import('../views/user/craftCenter.vue')
        },
        {
          // 上传视频
          path: 'uploadVideo',
          name: 'uploadVideo',
          component: () => import('../views/user/uploadVideo.vue')
        }
      ]
    },
    {
      //有关登录注册的总路由
      path: '/welcome',
      name: 'welcome',
      component: () => import('../views/welcome/welcome.vue'),
      children: [
        {
          // 登录
          path: '',
          name: 'login',
          component: () => import('../views/welcome/login.vue')
        },
        {
          // 注册
          path: 'register',
          name: 'register',
          component: () => import('../views/welcome/register.vue')
        },
      ]
    },
  ]
})

export default router
