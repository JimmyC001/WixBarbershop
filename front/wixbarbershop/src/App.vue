<template>
  <div>
    <div class="wrapper-input">
      <label>Nombre:</label>
      <input type="text" class="form" v-model="customer.name" />
    </div>
    <div class="wrapper-input">
      <label>Celular:</label>
      <input type="text" class="form" v-model="customer.cellphone" />
    </div>
    <div class="wrapper-input">
      <label>Contraseña:</label>
      <input type="text" class="form" v-model="customer.password" />
      <button @click="show">registrarse</button>
    </div>
  </div>
</template>

<script>
import { ref } from "vue";
export default {
  name: "App",
  setup() {
    const counter = ref(0);
    const customer = ref({
      name: "",
      cellphone: "",
      password: "",
    });

    function addCounter() {
      counter.value--;
    }
    function show(){
      console.log(customer.value.name)
      console.log(customer.value.cellphone)
      console.log(customer.value.password)
    }
    return {
      counter,
      addCounter,
      customer,
      show,
    };
  },
};
</script>

<style>
.form {
  margin-top: 2rem;
}
</style>
