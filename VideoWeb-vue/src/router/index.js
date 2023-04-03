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
      // 用户中心
      path: '/userCenter',
      name: 'userCenter',
      component: () => import('../views/user/userCenter.vue')
    },
    {
      // 创作中心
      path: '/craftCenter',
      name: 'craftCenter',
      component: () => import('../views/user/craftCenter.vue')
    },
    {
      // 上传视频
      path: '/uploadVideo',
      name: 'uploadVideo',
      component: () => import('../views/user/uploadVideo.vue')
    }
  ]
})

export default router
