<template>
<div>


  <el-menu
      style="width: 200px; min-height: calc(100vh - 50px);"
      :default-active="path"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose"
      router
      background-color="#30333c" text-color="#fff"
  >
    <el-menu-item index="/dashboard" >
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#icondashboard "></use>
      </svg>
      <span>展示板</span>
    </el-menu-item>
    <el-sub-menu index="20" text-color="#fff">
      <template #title>
        <svg class="icon" aria-hidden="true">
          <use xlink:href="#icon-mingpian "></use>
        </svg>
        <span>数据可视化</span>
      </template>
      <el-menu-item index="/DailyActionForAdmin" style="font-color: white" v-if="user.role == 1">
        <el-icon><Platform /></el-icon>
        <span>日常行为信息可视化</span>
      </el-menu-item>
      <el-menu-item index="/DailyActionForStudent" style="font-color: white">
        <el-icon><Notebook /></el-icon>
        <span>日常行为信息填写</span>
      </el-menu-item>
      <el-menu-item index="/HabitForAdmin">
        <el-icon><Platform /></el-icon>
      <span>爱好信息可视化</span>
    </el-menu-item>
      <el-menu-item index="/HabitForStudent">
        <el-icon><Notebook /></el-icon>
        <span>爱好信息填写</span>
      </el-menu-item>
      <el-menu-item index="/ActivityForAdmin">
        <el-icon><Platform /></el-icon>
        <span>课外活动信息可视化</span>
      </el-menu-item>
      <el-menu-item index="/ActivityForStudent">
        <el-icon><Notebook /></el-icon>
        <span>课外活动信息填写</span>
      </el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="21" text-color="#fff">
      <template #title>
        <svg class="icon" aria-hidden="true">
          <use xlink:href="#icon-mingpian "></use>
        </svg>
        <span>决策推荐</span>
      </template>
      <el-menu-item index="/person" style="font-color: white">
        <svg class="icon" aria-hidden="true">
          <use xlink:href="#icon-a-bianji1 "></use>
        </svg>
        <span>采购推荐</span>
      </el-menu-item>
      <el-menu-item index="/password">
        <svg class="icon" aria-hidden="true">
          <use xlink:href="#icon-mima "></use>
        </svg>
        <span>活动推荐</span>
      </el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="2" text-color="#fff">
      <template #title>
        <svg class="icon" aria-hidden="true">
          <use xlink:href="#icon-mingpian "></use>
        </svg>
        <span>个人信息</span>
      </template>
      <el-menu-item index="/person" style="font-color: white">
        <svg class="icon" aria-hidden="true">
          <use xlink:href="#icon-a-bianji1 "></use>
        </svg>
        <span>修改个人信息</span>
      </el-menu-item>
      <el-menu-item index="/password">
        <svg class="icon" aria-hidden="true">
          <use xlink:href="#icon-mima "></use>
        </svg>
        <span>修改密码</span>
      </el-menu-item>
    </el-sub-menu>
    <el-menu-item index="/user" v-if="user.role == 1">
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#iconreader "></use>
      </svg>
      <span>读者管理</span>
    </el-menu-item>
    <el-menu-item index="/book" v-if="user.role == 1" >
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#iconbook "></use>
      </svg>
      <span>书籍管理</span>
    </el-menu-item>
    <el-menu-item index="/book" v-if="user.role == 2">
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#iconbook "></use>
      </svg>
      <span>图书查询</span>
    </el-menu-item>
    <el-menu-item index="/lendrecord" v-if="user.role == 1">
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#iconlend-record "></use>
      </svg>
      <span>借阅管理</span>
    </el-menu-item>
    <el-menu-item index="/lendrecord" v-if="user.role == 2">
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#iconlend-record"></use>
      </svg>
      <span>借阅信息</span>
    </el-menu-item>
    <el-menu-item index="/bookwithuser" >
      <el-icon><grid /></el-icon>
      <span>借阅状态</span>
    </el-menu-item>
  </el-menu>

</div>
</template>

<script>



export default {
  name: "Aside",
  components:{},
  created(){
    let userStr = sessionStorage.getItem("user") ||"{}"
    this.user = JSON.parse(userStr)
    console.log(this.user);
  },
  data(){
    return {
      user:{},
      path: this.$route.path
    }
  }
}
</script>

<style scoped>
.icon {
  width: 30px;
  height: 30px;
  padding-top: 5px;
  padding-right: 10px;
}
</style>