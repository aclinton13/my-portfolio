/** Fetches the current header from the server and adds it to the page. */
async function showServerText() {
  const responseFromServer = await fetch('/head');
    // The json() function returns an object that contains fields that we can
  // reference to create HTML.
  const Array_temp = await responseFromServer.json();
  const index = Math.floor(Math.random() * Array_temp.length);

  const headContainer = document.getElementById('head-container');
  headContainer.innerText = Array_temp[index];
}
