class Solution {
public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<String> productsList = Arrays.asList(products);
        productsList.sort((a, b) -> a.compareTo(b));
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i+1);
            List<String> temp = productsList.stream().filter(product ->product.startsWith(prefix)).collect(Collectors.toList());
            result.add(temp.size() > 3 ? temp.subList(0, 3) : temp);
        }

        return result;
    }
}