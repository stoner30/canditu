$(document).ready(function(){
    //building.html
    building_list();
});

/*for building.html*/
function building_list() {
  
    $('#buildingList').listnav({
        includeOther: true,
        showCounts: false,
        includeNums: false,
        noMatchText: '没有内容',
        prefixes: ['the', 'a']
    });
}